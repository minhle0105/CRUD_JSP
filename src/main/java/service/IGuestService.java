package service;

import model.Guest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IGuestService {

    public List<Guest> getAllGuests();

    public void addNewGuest(Guest guest) throws SQLException;

    public boolean deleteGuest(int id) throws SQLException;

    public boolean updateGuest(Guest guest) throws SQLException;

    public Guest searchGuest(int id);

}
