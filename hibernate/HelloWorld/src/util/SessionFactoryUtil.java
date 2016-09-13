package util; /**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 6, 2010
 * Time: 6:19:22 PM
 * To change this template use File | Settings | File Templates.
 */
/**
 *
 * @author Sebastian Hennebrueder
 * created Feb 22, 2006
 * copyright 2006 by http://www.laliluna.de
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author hennebrueder This class garanties that only one single
 *         SessionFactory
 *         is instanciated and that the configuration is done thread safe
 *         as
 *         singleton. Actually id only wraps the Hibernate SessionFactory.
 *         You are free to use any kind of JTA or Thread
 *         transactionFactories.
 */
public class SessionFactoryUtil {
    /**
     * The single instance of hibernate SessionFactory
     */
    private static org.hibernate.SessionFactory sessionFactory;

    /**
     * disable contructor to guaranty a single instance
     */

    private SessionFactoryUtil() {
    }

    static {
        sessionFactory = new
                AnnotationConfiguration().configure().buildSessionFactory();
    }

    public static SessionFactory getInstance() {
        return sessionFactory;
    }

    /**
     * Opens a session and will not bind id to a session context
     *
     * @return the session
     */
    public Session openSession() {
        return sessionFactory.openSession();
    }

    /**
     * Returns a session from the session context. If there is no session in
     * the context id opens a session,
     * stores id in the context and returns id.
     * This factory is intended to be used with a hibernate.cfg.xml.xml
     * including the following property <property
     * name="current_session_context_class">thread</property> This would
     * return
     * the current open session or if this does not exist, will create a new
     * session
     *
     * @return the session
     */
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * closes the session factory
     */
    public static void close() {
        if (sessionFactory != null)
            sessionFactory.close();
        sessionFactory = null;
    }
}
