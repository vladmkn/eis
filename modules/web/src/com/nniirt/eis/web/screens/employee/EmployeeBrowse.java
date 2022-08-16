package com.nniirt.eis.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.catalog.Employee;

@UiController("eis_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}