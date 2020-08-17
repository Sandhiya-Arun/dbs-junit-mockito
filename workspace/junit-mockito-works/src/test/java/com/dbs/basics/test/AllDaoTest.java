package com.dbs.basics.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmployeeDAOTest.class, SampleDAOTest.class })
public class AllDaoTest {

}
