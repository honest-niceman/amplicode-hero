package io.amplicode.amplicodehero.jpa.other;

import io.amplicode.amplicodehero.jpa.entities.NewEntity;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.*;
import org.springframework.stereotype.Component;

@Component
public class HibernateEventListener implements FlushEventListener, PostCollectionRemoveEventListener, PreInsertEventListener, SaveOrUpdateEventListener {

    private final EntityManagerFactory entityManagerFactory;

    public HibernateEventListener(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void onFlush(FlushEvent event) throws HibernateException {

    }

    @Override
    public void onPostRemoveCollection(PostCollectionRemoveEvent event) {
        Object entity = event.getAffectedOwnerOrNull();
        if (entity instanceof NewEntity newEntity) {
            //TODO handle logic...
        }

    }

    @Override
    public boolean onPreInsert(PreInsertEvent event) {
        Object entity = event.getEntity();
        if (entity instanceof NewEntity newEntity) {
            //TODO handle logic...
        }
        return false;
    }

    @Override
    public void onSaveOrUpdate(SaveOrUpdateEvent event) throws HibernateException {
        Object entity = event.getObject();
        if (entity instanceof NewEntity newEntity) {
            //TODO handle logic...
        }

    }

    @PostConstruct
    private void postConstruct() {
        SessionFactoryImplementor sessionFactory = entityManagerFactory.unwrap(SessionFactoryImplementor.class);
        EventListenerRegistry registry = sessionFactory
                .getServiceRegistry()
                .getService(EventListenerRegistry.class);
        registry.prependListeners(EventType.FLUSH, this);
        registry.prependListeners(EventType.POST_COLLECTION_REMOVE, this);
        registry.prependListeners(EventType.PRE_INSERT, this);
        registry.prependListeners(EventType.SAVE_UPDATE, this);
    }
}