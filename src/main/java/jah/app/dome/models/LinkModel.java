package jah.app.dome.models;

/**
 * Representation of a hyperlink.
 */
public class LinkModel {

  /**
   * Uri to the image.
   */
  private String image;

  /**
   * Returns the uri to the image.
   *
   * @return Uri to string
   */
  public String getImage() {

    return image;
  }

  /**
   * Sets the uri to the Image.
   *
   * @param value uri to image
   */
  public void setImage(final String value) {

    image = value;
  }

  /**
   * Name of the link used for link description or content.
   */
  private String name;

  /**
   * Returns name.
   *
   * @return
   */
  public String getName() {

    return name;
  }

  /**
   * Sets the name.
   *
   * @param value the name
   */
  public void setName(final String value) {

    name = value;
  }

  /**
   * The uri for the link.
   */
  private String uri;

  /**
   * Returns the uri.
   */
  public String getUri() {

    return uri;
  }

  /**
   * Sets the uri.
   *
   * @param uri the uri
   */
  public void setUri(final String uri) {

    this.uri = uri;
  }

  /**
   * Constructor for this class.
   *
   * @param name name of the link
   * @param uri  link destination
   */
  public LinkModel(final String name, final String uri) {

    this.name = name;
    this.uri = uri;
  }


}
