package controller;

import model.Guest;
import service.GuestServiceImpl;
import service.IGuestService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GuestController", urlPatterns = "/guests")
public class GuestController extends HttpServlet {
    private final IGuestService guestService = new GuestServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handle(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handle(request,response);
    }

    private void handle(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String action = request.getParameter("ac");
        if(action == null){
            action = "";
        }
        switch (action){
            case "login":
                break;
            case "create":
                addNewGuest(request, response);
                break;
            case "delete":
                deleteGuest(request, response);
                break;
            case "update":
                updateGuest(request, response);
                break;
            case "search":
                List<Guest> searchResult = searchGuest(request, response);
                request.setAttribute("guests", searchResult);
                request.getRequestDispatcher("guest/searchResult.jsp").forward(request,response);
                break;
        }
        List<Guest> guests = guestService.getAllGuests();
//        request.setAttribute("guests",new Guest(100,"Ha Nguyen",23));
        request.setAttribute("guests", guests);
        request.getRequestDispatcher("/guest/list.jsp")
                .forward(request,response);
    }



    public void addNewGuest(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        Guest newGuest = new Guest(id, name, age);
        guestService.addNewGuest(newGuest);
    }

    public void deleteGuest(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDel"));
        guestService.deleteGuest(id);
    }

    public void updateGuest(HttpServletRequest request, HttpServletResponse response) {
        int currentId = Integer.parseInt(request.getParameter("current_id"));
        int newId = Integer.parseInt(request.getParameter("new_id"));
        String newName = request.getParameter("new_name");
        int newAge = Integer.parseInt(request.getParameter("new_age"));
        guestService.updateGuest(currentId, newId, newName, newAge);
    }

    public List<Guest> searchGuest(HttpServletRequest request, HttpServletResponse response){
        String searchName = request.getParameter("searchName");
        return guestService.searchGuest(searchName);
    }

}
