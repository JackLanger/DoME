package jah.app.dome.models;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link TaskModel} to reflect the content of a task.
 */
public class TaskModel implements Model {
  //TODO(Jack/Ahmet):implement

  /**
   * Title of the task.
   */
  private String title;
  /**
   * Date when task was created.
   */
  private String dateCreated;
  /**
   * Tags of the task.
   */
  private List<String> tags;
  /**
   * Creator of the task.
   */
  private UserModel createdBy;
  /**
   * List of users currently assigned to the task.
   */
  private List<UserModel> assigned;
  /**
   * The project the task is for.
   */
  private ProjectModel project;

  /**
   * Id of the task.
   */
  private long id;

  /**
   * A brief description of the task.
   */
  private String description;

  /**
   * Returns the description
   *
   * @return description
   */
  public String getDescription() {

    return description;
  }

  /**
   * Sets the description of the task.
   *
   * @param description a description for the task
   */
  public void setDescription(final String description) {

    this.description = description;
  }

  /**
   * Returns title.
   *
   * @return title
   */
  public String getTitle() {

    return title;
  }

  /**
   * sets title
   *
   * @param title the title
   */
  public void setTitle(final String title) {

    this.title = title;
  }

  /**
   * Returns the creation date.
   *
   * @return date created
   */
  public String getDateCreated() {

    return dateCreated;
  }

  /**
   * sets the date created.
   *
   * @param dateCreated the date the task was created.
   */
  public void setDateCreated(final String dateCreated) {
    //TODO(JACK/AHMET): create date conversion from date to string.
    this.dateCreated = dateCreated;
  }

  /**
   * Returns the tags of the task.
   *
   * @return Array of tags
   */
  public List<String> getTags() {

    return tags;
  }

  /**
   * sets the tags of the task.
   *
   * @param tags the tags for this task.
   */
  public void setTags(final List<String> tags) {

    this.tags = tags;
  }

  /**
   * adds a new tag to the list of tags.
   *
   * @param tag a tag
   */
  public void addTag(final String tag) {

    tags.add(tag);
  }

  /**
   * remove a tag from the list of tags.
   *
   * @param tag tag
   */
  public static void removeTag(final String tag) {

    removeTag(tag);
  }

  /**
   * removes the index at a given index.
   *
   * @param index the index
   */
  public void removeTag(final int index) {

    tags.remove(index);
  }

  /**
   * Returns the creator of the task.
   *
   * @return User that created the task
   */
  public UserModel getCreatedBy() {

    return createdBy;
  }

  /**
   * Sets the creator.
   *
   * @param createdBy the creator
   */
  public void setCreatedBy(final UserModel createdBy) {

    this.createdBy = createdBy;
  }

  /**
   * Returns a list of users assigned to the task.
   *
   * @return list of users
   */
  public List<UserModel> getAssigned() {

    return assigned;
  }

  /**
   * Sets a list of users assigned to the task.
   *
   * @param assigned users assigned to the task
   */
  public void setAssigned(final List<UserModel> assigned) {

    this.assigned = assigned;
  }

  /**
   * Assign a new user to the task.
   *
   * @param user a user
   */
  public void assignNewUser(final UserModel user) {

    assigned.add(user);
  }


  /**
   * Removes a user from the assigned list.
   *
   * @param user a user
   */
  public void unassignUser(final UserModel user) {

    assigned.remove(user);
  }

  /**
   * get the project of the task
   *
   * @return {@link ProjectModel}
   */
  public ProjectModel getProject() {

    return project;
  }

  /**
   * Sets the project.
   */
  public void setProject(final ProjectModel project) {

    this.project = project;
  }

  /**
   * Returns the id.
   *
   * @return id
   */
  public long getId() {

    return id;
  }

  /**
   * Sets the id.
   *
   * @param id id
   */
  public void setId(final long id) {

    this.id = id;
  }

  @Override
  public boolean isEmpty() {

    return false;
  }

  /**
   * Constructor for this class.
   *
   * @param title       the title
   * @param dateCreated the date created
   * @param createdBy   creator of the task
   * @param project     the project
   * @param description description of the task
   */
  public TaskModel(final String title,
                   final String dateCreated,
                   final UserModel createdBy,
                   final ProjectModel project,
                   final String description) {

    this(title, dateCreated, createdBy, project, description, new ArrayList<>(), new ArrayList<>());
  }

  /**
   * Constructor for this class.
   *
   * @param title       the title
   * @param dateCreated the date created
   * @param createdBy   creator of the task
   * @param project     the project
   * @param description description of the task
   * @param tags        tags of the task
   * @param assigned    assigned users
   */
  public TaskModel(final String title,
                   final String dateCreated,
                   final UserModel createdBy,
                   final ProjectModel project,
                   final String description,
                   final List<String> tags,
                   final List<UserModel> assigned
  ) {

    super();
    this.title = title;
    this.dateCreated = dateCreated;
    this.tags = tags;
    this.createdBy = createdBy;
    this.assigned = assigned;
    this.project = project;
    this.description = description;
  }

}
