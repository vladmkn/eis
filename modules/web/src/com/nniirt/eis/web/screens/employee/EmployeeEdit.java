package com.nniirt.eis.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.catalog.Employee;

@UiController("eis_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}