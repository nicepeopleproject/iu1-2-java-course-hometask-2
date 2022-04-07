package task2;

abstract class Base {
    abstract double getSalary();
}

class HourEmployee extends Base{
    double _salary;
    HourEmployee(double _salary){
        this._salary = _salary;
    }
    @Override
    double getSalary() {
        return 20.8*8*_salary;
    }
};

class MonthEmployee extends Base{
    double _salary;
    MonthEmployee(double _salary){
        this._salary = _salary;
    }
    @Override
    double getSalary() {
        return _salary;
    }
};