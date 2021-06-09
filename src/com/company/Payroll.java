package com.company;
class Department {
    int dept_no;
    String dept_name;

    public Department(int dept_no, String dept_name) {
        this.dept_no = dept_no;
        this.dept_name = dept_name;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
    public void display()
    {
        System.out.println(dept_no + " " + dept_name);
    }
}
class Position
{
    int post_code;
    String post_name;
    String department;
    long basic_salary;
    long rate_per_hour;

    public Position(int post_code, String post_name, String department, long basic_salary, long rate_per_hour) {
        this.post_code = post_code;
        this.post_name = post_name;
        this.department = department;
        this.basic_salary = basic_salary;
        this.rate_per_hour = rate_per_hour;
    }

    public int getPost_code() {
        return post_code;
    }

    public void setPost_code(int post_code) {
        this.post_code = post_code;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(long basic_salary) {
        this.basic_salary = basic_salary;
    }

    public long getRate_per_hour() {
        return rate_per_hour;
    }

    public void setRate_per_hour(long rate_per_hour) {
        this.rate_per_hour = rate_per_hour;
    }
    public void display(){
        System.out.println(post_code + "" + post_name + "" +department + " " +basic_salary +" " +rate_per_hour);
    }
}

class Employee {
    int emp_num;
    String first_name;
    String middle_name;
    String last_name;
    String position;
    String status;
    int no_of_hours;

    public Employee(int emp_num, String first_name, String middle_name, String last_name, String position, String status, int no_of_hours) {
        this.emp_num = emp_num;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.position = position;
        this.status = status;
        this.no_of_hours = no_of_hours;
    }

    public int getEmp_num() {
        return emp_num;
    }

    public void setEmp_num(int emp_num) {
        this.emp_num = emp_num;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }
    void display()
    {
        System.out.println(emp_num + " " + first_name + ""+ middle_name + " "+ last_name + "" + position + ""+status+ ""+no_of_hours);
    }
}
public class Payroll {

    public static void main(String[] args) {
        Department d1 = new Department(100, "CSE");
        Department d2 = new Department(200, "ECE");
        Department d3 = new Department(300, "IT");
        Position p1 = new Position(11, "dean", "CSE", 12000, 400);
        Position p2 = new Position(12, "Registar", "It", 10000, 200);
        Employee e1 = new Employee(1111, "john","joy","harper", "Dean", "Active", 30);
        Employee e2 = new Employee(222,"aditya","ram","christoper", "Registar", "Active" ,40);
        Employee e3 = new Employee(333,"joey","harley","nolan","Lecturer","inactive",45);


    }
}
