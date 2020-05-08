package no.adrsolheim.webapp.album;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AlbumDAOHibernateImpl implements AlbumDAO {

    private EntityManager entityManager;

    // constructor injection (entitymanager is automatically created by spring boot)
    @Autowired
    public AlbumDAOHibernateImpl(EntityManager em) {
        entityManager = em;
    }


    @Override
    @Transactional
    public Album findById(int albumId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Album album = currentSession.get(Album.class, albumId);

        return album;
    }

    @Override
    public void save(Album album) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(album);

    }

    @Override
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Album> q = currentSession.createQuery("delete from Album where id=:albumId");
        q.setParameter("albumId",id);
        q.executeUpdate();
    }

    @Override
    @Transactional
    public List<Album> findAll() {
        // get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create query
        Query<Album> q = currentSession.createQuery("from Album", Album.class);
        // execute query and save result
        List<Album> albums = q.getResultList();

        return albums;
    }
}
