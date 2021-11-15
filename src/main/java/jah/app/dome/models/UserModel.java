package jah.app.dome.models;

import jah.app.dome.models.utils.UserType;
import java.util.ArrayList;
import java.util.List;

/**
 * User model, reflecting a user in the DoME environment.
 */
public class UserModel implements Model {

  /**
   * The user name.
   */
  private String username;
  /**
   * The user type.
   */
  private UserType userType;
  /**
   * User id.
   */
  private long id;

  /**
   * List of Projects.
   */
  private List<ProjectModel> projects;

  /**
   * Constructor for this class.
   *
   * @param username the username
   * @param userType user type
   * @param projects projects
   */
  public UserModel(final String username,
                   final UserType userType,
                   final List<ProjectModel> projects) {

    super();
    this.username = username;
    this.userType = userType;
    this.projects = projects;
  }

  /**
   * Constructor for new User, with empty projects.
   *
   * @param username the username
   * @param type     the usertype
   */
  public UserModel(final String username, final UserType type) {

    this(username, type, new ArrayList<>());
  }

  /**
   * Sets the username.
   *
   * @param username name of the user
   */
  public void setUsername(final String username) {

    this.username = username;
  }

  /**
   * Sets the user type.
   *
   * @param userType user type
   */
  public void setUserType(final UserType userType) {

    this.userType = userType;
  }

  /**
   * the id of the user.
   *
   * @param id a long value for the id
   */
  public void setId(final long id) {

    this.id = id;
  }

  /**
   * Sets the projects.
   *
   * @param projects the projects of the user.
   */
  public void setProjects(final List<ProjectModel> projects) {

    this.projects = projects;
  }

  /**
   * Get username.
   *
   * @return username
   */
  public String getUsername() {

    return username;
  }

  /**
   * Returns the user type.
   *
   * @return {@link UserType}
   */
  public UserType getUserType() {

    return userType;
  }

  /**
   * Returns the id.
   *
   * @return {@link Long} representing the user's id.
   */
  public long getId() {

    return id;
  }

  /**
   * Returns the projects.
   *
   * @return {@link List} of {@link ProjectModel}
   */
  public List<ProjectModel> getProjects() {

    return projects;
  }

  @Override
  public boolean isEmpty() {

    return false;
  }


  /**
   * Adds a new {@link ProjectModel}.
   *
   * @param project {@link ProjectModel}
   */
  public void addProject(final ProjectModel project) {

    projects.add(project);
  }

  /**
   * removes a {@link ProjectModel}.
   *
   * @param project {@link ProjectModel}
   */
  public void removeProject(final ProjectModel project) {

    projects.remove(project);
  }


}
