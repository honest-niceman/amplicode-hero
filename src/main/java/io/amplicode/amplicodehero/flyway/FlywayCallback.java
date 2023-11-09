package io.amplicode.amplicodehero.flyway;

import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;

public class FlywayCallback implements Callback {

    @Override
    public boolean supports(Event event, Context context) {
        return event.equals(Event.BEFORE_EACH_MIGRATE) || event.equals(Event.AFTER_EACH_MIGRATE_ERROR) || event.equals(Event.BEFORE_EACH_UNDO) || event.equals(Event.AFTER_EACH_UNDO_STATEMENT_ERROR);
    }

    @Override
    public boolean canHandleInTransaction(Event event, Context context) {
        return true;
    }

    @Override
    public void handle(Event event, Context context) {
        //TODO handle logic...
    }

    public String getCallbackName() {
        return "FlywayASf";
    }
}