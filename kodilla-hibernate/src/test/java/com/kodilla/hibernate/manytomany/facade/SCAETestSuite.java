package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SCAETestSuite {

    @Autowired
    private SearchCompaniesAndEmployees scae;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testCompanyList() {

        //Given
        List<Company> list = new ArrayList<>();
        list.add(new Company ("Software Machine"));
        list.add(new Company ("Data Maesters"));
        list.add(new Company ("Grey Matter"));
        list.add(new Company ("Data Engineers"));

        companyDao.save(list.get(0));
        companyDao.save(list.get(1));
        companyDao.save(list.get(2));
        companyDao.save(list.get(3));

        //When
        list = scae.findCompaniesByName("Da");

        //Then
        assertEquals(2, list.size());

        //Clean up
        companyDao.deleteAll();

    }

    @Test
    void testEmployeeList() {

        //Given
        List<Employee> list = new ArrayList<>();
        list.add(new Employee ("Dawid","Kocik"));
        list.add(new Employee ("Kamil", "Rutkowski"));
        list.add(new Employee ("Ola", "Gawrońska"));
        list.add(new Employee ("Agnieszka", "Iwaniak"));

        employeeDao.save(list.get(0));
        employeeDao.save(list.get(1));
        employeeDao.save(list.get(2));
        employeeDao.save(list.get(3));

        //When
        list = scae.findEmployeesByName("Koc");

        //Then
        assertEquals(1, list.size());

        //Clean up
        employeeDao.deleteAll();
    }
}
