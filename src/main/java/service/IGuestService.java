package service;

import model.Guest;

import java.util.ArrayList;
import java.util.List;

public interface IGuestService {

    public List<Guest> getAllGuests();

    public void addNewGuest(Guest guest);

    public void deleteGuest(int id);

    public void updateGuest(int id, int newID, String newName, int newAge);

    public List<Guest> searchGuest(String searchName);

}
