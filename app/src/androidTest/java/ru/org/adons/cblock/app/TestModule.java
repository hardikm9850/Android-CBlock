package ru.org.adons.cblock.app;

import com.squareup.sqlbrite.BriteContentResolver;

import dagger.Module;
import dagger.Provides;
import ru.org.adons.cblock.datamodel.CallLogModel;
import ru.org.adons.cblock.ui.base.ViewScope;

/**
 * Provide Application and data-model dependencies for test
 */

@Module
public class TestModule {

    @ViewScope
    @Provides
    CallLogModel provideCallLogModel(BriteContentResolver resolver) {
        return new CallLogModel(resolver);
    }

}