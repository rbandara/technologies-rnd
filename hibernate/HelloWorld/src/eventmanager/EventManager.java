package eventmanager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.annotations.NamedQuery;
import util.SessionFactoryUtil;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 6, 2010
 * Time: 11:47:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class EventManager {
    public static void main(String[] args) {
          EventManager mgr = new EventManager();
          String command = "store";
          if (command.equals("store")) {
              mgr.createAndStoreEvent("My Event", new Date());
          }

          SessionFactoryUtil.getInstance().close();
      }

      private void createAndStoreEvent(String title, Date theDate) {
          Session session = SessionFactoryUtil.getInstance().getCurrentSession();
          session.beginTransaction();
          Event theEvent = new Event();
          theEvent.setTitle(title);
          theEvent.setDate(theDate);
          session.save(theEvent);

          session.getTransaction().commit();
      }

    @NamedQuery(name="MyEntity.getItemsPerProductCategory",
        query="SELECT i FROM Item i WHERE i.product.categoryID LIKE :cID"
    )
    

    public Event getEventByANamedQuery(String param){
        Session session = SessionFactoryUtil.getInstance().getCurrentSession();
        Query query = session.getNamedQuery("person").setString("namedparameter",param);

        return null;
    }

}
