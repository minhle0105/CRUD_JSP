package service;

import model.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestServiceImpl implements IGuestService {
    List<Guest> guestList = new ArrayList<>();


    @Override
    public List<Guest> getAllGuests() {
        return guestList;
    }

    @Override
    public void addNewGuest(Guest guest) {
        guestList.add(guest);
    }

    @Override
    public void deleteGuest(int id) {
        guestList.remove(id - 1);
    }

    @Override
    public void updateGuest(int id, int newID, String newName, int newAge) {
        for (Guest g : guestList) {
            if (g.getId() == id) {
                g.setId(newID);
                g.setName(newName);
                g.setAge(newAge);
            }
        }
    }

    @Override
    public List<Guest> searchGuest(String searchName) {
        List<Guest> searchResult = new ArrayList<>();
        for (Guest guest : guestList) {
            if (guest.getName().toLowerCase().contains(searchName.toLowerCase())) {
                searchResult.add(guest);
            }
        }
        return searchResult;
    }
}
