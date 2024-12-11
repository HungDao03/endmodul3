package service;

import Dao.SachDAO;
import model.Sach;

import java.util.List;

public class SachService extends BaseService<Sach> {
    private SachDAO sachDAO = new SachDAO();

    @Override
    public List<Sach> getAll() {
        return sachDAO.getAllSach();
    }

    @Override
    public Sach getById(String id) {
        return sachDAO.getSachById(id);
    }

    @Override
    public boolean add(Sach sach) {
        return sachDAO.addSach(sach);
    }

    @Override
    public boolean update(Sach sach) {
        return sachDAO.updateSach(sach);
    }

    @Override
    public boolean delete(String id) {
        return sachDAO.deleteSach(id);
    }

    public boolean decreaseSoLuongSach(String maSach) {
        return sachDAO.decreaseSoLuongSach(maSach);
    }
}
