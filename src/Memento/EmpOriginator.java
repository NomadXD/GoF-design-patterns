package Memento;

public class EmpOriginator {

    private int empId;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;

    public EmpOriginator(int empId, String empName, String empPhoneNo, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public void setEmpPhoneNo(String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }


    public EmpMemento saveToMemento(){
        return new EmpMemento(this.empId,this.empName,this.empPhoneNo,this.empDesignation);
    }

    public void undoFromMemento(EmpMemento empMemento){
        this.empId = empMemento.getEmpId();
        this.empName =empMemento.getEmpName();
        this.empPhoneNo = empMemento.getEmpPhoneNo();
        this.empDesignation= empMemento.getEmpDesignation();
    }

    @Override
    public String toString() {
        return "EmpOriginator{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empPhoneNo='" + empPhoneNo + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }
}
