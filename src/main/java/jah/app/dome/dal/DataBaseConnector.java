package jah.app.dome.dal;

import jah.app.dome.models.Model;

import java.util.List;

/**
 * {@link DataBaseConnector} provides CRUD functionality to a database data layer.
 *
 * @param <ModelT>
 */
public interface DataBaseConnector<ModelT extends Model> {
  /**
   * Connect to the database.
   */
  public void connect();

  /**
   * disconnect from the database and release resources.
   */
  public void disconnect();

  /**
   * Write entities to the database.
   *
   * @param data data to be written
   * @return true if successful
   */
  public boolean writeData(List<ModelT> data);

  /**
   * deleteEntity from database.
   *
   * @param entity the entity to be removed.
   * @return true if successful
   */
  public boolean deleteEntity(ModelT entity);
}
