package io.tasteit.rest.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class PropertiesParser {

    private final Properties properties = new Properties();

    public PropertiesParser(@Nonnull String propertyFile) throws IOException {
        InputStream propertiesInputStream = getClass().getClassLoader().getResourceAsStream(propertyFile);        
        
        if (propertiesInputStream == null) {
            throw new FileNotFoundException(String.format("Property file %s does not exist." , propertyFile));
        }        
        this.properties.load(propertiesInputStream);
    }

    public @Nullable String getProperty(@Nonnull String key) {
        return properties.getProperty(key);
    }

    public @Nonnull String getProperty(@Nonnull String key, @Nonnull String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}