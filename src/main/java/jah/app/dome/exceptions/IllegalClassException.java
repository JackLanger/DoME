package jah.app.dome.exceptions;

import java.io.Serial;

public class IllegalClassException extends Throwable {


  @Serial
  private static final long serialVersionUID = 8338344080121498038L;

  public IllegalClassException(final String message) {

    super(message);
  }

}
