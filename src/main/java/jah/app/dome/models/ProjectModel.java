package jah.app.dome.models;

import java.util.Date;

/**
 * Project class.
 */
public class ProjectModel extends BaseProjectModel {

  /**
   * Title of the Project
   */
  private final String title;
  /**
   * The Date the project was created.
   */
  private final String dateCreated;


  @Override
  public boolean isEmpty() {

    return false;
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
   * returns dateCreated.
   *
   * @return date created
   */
  public String getDateCreated() {

    return dateCreated;
  }

  /**
   * Constructor for new Project.
   *
   * @param title       the title of the project.
   * @param dateCreated the date
   */
  public ProjectModel(final String title, final String dateCreated) {

    super();
    this.title = title;
    this.dateCreated = dateCreated == null ? new Date().toString() : dateCreated;
  }

}
