package org.sid.designpatterns.creational.singleton;

import java.io.Serializable;

public class BestSingletonCreationApproach implements Serializable {
    private static final long serialVersionUID = 1L;

    private BestSingletonCreationApproach() {

    }

    public BestSingletonCreationApproach getInstance() {
        return SingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    private static class SingletonHolder {
        private static final BestSingletonCreationApproach INSTANCE = new BestSingletonCreationApproach();
    }
}
