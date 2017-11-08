/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
    /**
     * Name of the employee.
     */
    private String name;
    /**
     * The employee's manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param newName - name of the employee
     * @param newManager - name of the employer
     */
    public Employee(final String newName, final String newManager) {
        this.name = newName;
        this.manager = newManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param newname - new name
     */
    public void setName(final String newname) {
        this.name = newname;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param newmanager - new manager
     */
    public void setManager(final String newmanager) {
        this.manager = newmanager;
    }
}
