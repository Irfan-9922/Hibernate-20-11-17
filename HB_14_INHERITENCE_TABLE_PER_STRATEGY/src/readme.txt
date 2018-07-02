

This program gives an error with respect to mapping a class 
this would be happen because id.

    @GeneratedValue(strategy=GenerationType.TABLE)
    in the top of id genrator
    else it gives exception called
    
    Exception in thread "main" org.hibernate.MappingException: Cannot use identity column key generation with <union-subclass> mapping for: org.javateam.model1.twowheeler
	at org.hibernate.persister.entity.UnionSubclassEntityPersister.<init>(UnionSubclassEntityPersister.java:96)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:408)
	at org.hibernate.persister.internal.PersisterFactoryImpl.create(PersisterFactoryImpl.java:163)
	at org.hibernate.persister.internal.PersisterFactoryImpl.createEntityPersister(PersisterFactoryImpl.java:135)
	at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:401)
	at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1859)
	at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1930)
	at org.javateam.model1.test.main(test.java:34)