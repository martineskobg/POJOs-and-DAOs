package pojos.and.daos;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        // customerDao.save();

        // customerDao.update();

        //  customerDao.delete();

        // TODO remove all constraints from customers table
        // customerDao.deleteAll();

        // System.out.println(customerDao.getRandomId());

        // System.out.println(customerDao.getRandomIds(4));

        System.out.println(customerDao.getRecordsCount());

    }
}
