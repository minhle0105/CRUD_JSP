package controller;

import model.Guest;
import service.GuestServiceImpl;
import service.IGuestService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GuestController", urlPatterns = "/guests")
public class GuestController extends HttpServlet {
    private final IGuestService guestService = new GuestServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("ac");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create" -> showNewForm(request, response);
                case "edit" -> showEditForm(request, response);
                case "delete" -> deleteGuest(request, response);
                default -> listGuest(request, response);
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("ac");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create" -> addNewGuest(request, response);
                case "update" -> updateGuest(request, response);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("guest/create.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Guest existingGuest = guestService.searchGuest(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("guest/update.jsp");
        request.setAttribute("guests", existingGuest);
        dispatcher.forward(request, response);
    }

    private void listGuest(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Guest> listGuest = guestService.getAllGuests();
        request.setAttribute("guests", listGuest);
        RequestDispatcher dispatcher = request.getRequestDispatcher("guest/list.jsp");
        dispatcher.forward(request, response);
    }

    public void addNewGuest(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        Guest newGuest = new Guest(id, name, age);
        guestService.addNewGuest(newGuest);
        RequestDispatcher dispatcher = request.getRequestDispatcher("guest/create.jsp");
        dispatcher.forward(request, response);
    }

    public void deleteGuest(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idDel"));
        guestService.deleteGuest(id);
        List<Guest> listGuest = guestService.getAllGuests();
        request.setAttribute("guests", listGuest);
        RequestDispatcher dispatcher = request.getRequestDispatcher("guest/list.jsp");
        dispatcher.forward(request, response);
    }

    public void updateGuest(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int newId = Integer.parseInt(request.getParameter("idUpdate"));
        String newName = request.getParameter("new_name");
        int newAge = Integer.parseInt(request.getParameter("new_age"));
        Guest guestNewInfo = new Guest(newId, newName, newAge);
        guestService.updateGuest(guestNewInfo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("guest/update.jsp");
        dispatcher.forward(request, response);
    }

}
