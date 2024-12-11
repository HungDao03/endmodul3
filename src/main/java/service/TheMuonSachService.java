package service;

import Dao.TheMuonSachDAO;
import model.TheMuonSach;

import java.util.List;

public class TheMuonSachService extends BaseService<TheMuonSach> {
    private TheMuonSachDAO theMuonSachDAO = new TheMuonSachDAO();

    @Override
    public List<TheMuonSach> getAll() {
        return theMuonSachDAO.getAllSachMuon();
    }

    @Override
    public TheMuonSach getById(String id) {
        return theMuonSachDAO.getSachMuonById(id);
    }

    @Override
    public boolean add(TheMuonSach theMuonSach) {
        return theMuonSachDAO.addTheMuonSach(theMuonSach);
    }

    @Override
    public boolean update(TheMuonSach theMuonSach) {
        return theMuonSachDAO.updateTheMuonSach(theMuonSach);
    }

    @Override
    public boolean delete(String id) {
        return theMuonSachDAO.deleteTheMuonSach(id);
    }

    public List<TheMuonSach> getAllTheMuonSach() {
        return theMuonSachDAO.getAllSachMuon();
    }
}
