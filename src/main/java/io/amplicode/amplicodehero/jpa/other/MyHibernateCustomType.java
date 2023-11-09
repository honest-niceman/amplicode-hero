package io.amplicode.amplicodehero.jpa.other;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;

public class MyHibernateCustomType extends AbstractSingleColumnStandardBasicType<String> {
    public MyHibernateCustomType() {
        super(new org.hibernate.type.descriptor.sql.BitTypeDescriptor(), new MyHibernateCustomDescriptor());
    }

    @Override
    public String getName() {
        return "MyHibernateCustom";
    }

    @Override
    public Object resolve(Object value, SharedSessionContractImplementor session, Object owner, Boolean overridingEager) throws HibernateException {
        return null;
    }

}
