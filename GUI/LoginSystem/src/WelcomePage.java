import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    JFrame frame;
    JLabel welcomeLabel, employeeNumberLabel, nameLabel, addressLabel, jobTitleLabel, attendanceLabel, benefitsLabel, salaryLabel, deductionLabel;
    String employeeNumber, name, address, jobTitle, attendance, benefits, salary, deduction;

    WelcomePage(String userID){
        EmployeeDetails employeeDetails = getEmployeeDetails(userID);
        employeeNumber = employeeDetails.employeeNumber;
        name = employeeDetails.name;
        address = employeeDetails.address;
        jobTitle = employeeDetails.jobTitle;
        attendance = employeeDetails.attendance;
        benefits = employeeDetails.benefits;
        salary = employeeDetails.salary;
        deduction = employeeDetails.deduction;

        welcomeLabel = new JLabel("Welcome "+name);
        welcomeLabel.setBounds(0,0,200,35);

        employeeNumberLabel = new JLabel("Employee Number: "+employeeNumber);
        employeeNumberLabel.setBounds(50,50,200,35);

        nameLabel = new JLabel("Name: "+name);
        nameLabel.setBounds(100,80,200,35);

        addressLabel = new JLabel("Address: "+address);
        addressLabel.setBounds(100,110,1000,35);

        jobTitleLabel = new JLabel("Job Title: "+jobTitle);
        jobTitleLabel.setBounds(100,140,200,35);

        attendanceLabel = new JLabel("Attendance: "+attendance);
        attendanceLabel.setBounds(100,170,200,35);

        benefitsLabel = new JLabel("Benefits: "+benefits);
        benefitsLabel.setBounds(100,200,1000,35);

        salaryLabel = new JLabel("Salary: "+salary);
        salaryLabel.setBounds(100,230,200,35);

        deductionLabel = new JLabel("Deduction: "+deduction);
        deductionLabel.setBounds(100,260,1000,35);

        frame = new JFrame();
        frame.add(welcomeLabel);
        frame.add(employeeNumberLabel);
        frame.add(nameLabel);
        frame.add(addressLabel);
        frame.add(jobTitleLabel);
        frame.add(attendanceLabel);
        frame.add(benefitsLabel);
        frame.add(salaryLabel);
        frame.add(deductionLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    private EmployeeDetails getEmployeeDetails(String userID) {
        // code to retrieve employee details using userID
        EmployeeDetails employeeDetails = new EmployeeDetails("10001", "Jose Crisostomo", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands", "HR Manager", "Present", "\n Rice Subsidy: 1,500 \nPhone Allowance: 1,100 \nClothing Allowance: 1,000 \nTotal:PHP3600.0", "PHP62670.0", "SSS,PAGIBIG,PHILHEALTH");
        return employeeDetails;
    }
    

    class EmployeeDetails {
        String employeeNumber;
        String name;
        String address;
        String jobTitle;
        String attendance;
        String benefits;
        String salary;
        String deduction;

        EmployeeDetails(String employeeNumber, String name, String address, String jobTitle, String attendance, String benefits, String salary, String deduction) {
            this.employeeNumber = employeeNumber;
            this.name = name;
            this.address = address;
            this.jobTitle = jobTitle;
            this.attendance = attendance;
            this.benefits = benefits;
            this.salary = salary;
            this.deduction = deduction;
        }
    }
}
