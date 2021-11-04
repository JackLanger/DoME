package jah.app.dome.dal;

import jah.app.dome.models.Model;

import java.util.List;

/**
 * Database access, to provide simple CRUD functionality.
 */
public interface DataProvider<ModelT extends Model> {

  /**
   * Retrieve data from a datasource.
   *
   * @return {@link List} of {@link Model}.
   */
  public List<ModelT> getData();
}
