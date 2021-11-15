package jah.app.dome.models.utils;

/**
 * Enum holding for allocating Usertypes.
 */
public enum UserType {
  /**
   * Standard User.
   */
  STANDARD("standard"),
  /**
   * Admin.
   */
  ADMIN("admin");

  /**
   * Backing field for the usertype selected.
   */
  private final String usertype;

  /**
   * Constructor for this class.
   *
   * @param usertype the corresponding string output
   */
  UserType(final String usertype) {

    this.usertype = usertype;
    // empty constructor
  }

  public String getUsertype() {

    return usertype;
  }
}
