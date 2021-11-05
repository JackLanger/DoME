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

  /**
   * Returns the contents of a database.
   *
   * @return {@link List} of {@link Model}s.
   */
  public List<ModelT> getEntities();

  /**
   * Returns a specific amount of entites back from the database.
   *
   * @param amount the amount of entities to be returned
   * @return {@link List} of {@link Model}s.
   */
  public List<ModelT> getEntities(int amount);

  /**
   * Filter the databank using the the filter provided and return the matching results.
   *
   * @param filter the filter to be used
   * @return {@link List} of {@link Model}s.
   */
  public List<ModelT> getEntities(String filter);

  /**
   * Update the database to reflect changes made to the entities.
   *
   * @return true if successful
   */
  public boolean update();

}
