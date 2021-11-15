package jah.app.dome.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for projects.
 */
public abstract class BaseProjectModel implements Model {

  /**
   * Tasks in a project.
   */
  protected List<TaskModel> tasks;
  /**
   * List of Users assigned to the project.
   */
  protected List<UserModel> users;

  /**
   * Removes a task from tasks.
   *
   * @param task the task to be removed
   */
  public void removeTask(final TaskModel task) {

    tasks.remove(task);
  }

  /**
   * Adds a task to the tasks.
   *
   * @param task new task
   */
  public void addTask(final TaskModel task) {

    tasks.add(task);
  }

  /**
   * Removes a certain user from the users.
   *
   * @param user user to be removed
   */
  public void removeUser(final UserModel user) {

    users.remove(user);
  }

  /**
   * Adds a new User to the Project.
   *
   * @param user user
   */
  public void addUser(final UserModel user) {

    users.add(user);
  }

  /**
   * Constructor for this class. instantiating a new {@link ArrayList} for tasks and users.
   */
  public BaseProjectModel() {

    tasks = new ArrayList<>();
    users = new ArrayList<>();
  }

}
