package com.mgorski.articles.network.model;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "string")
@Namespace(reference = "http://schemas.microsoft.com/2003/10/Serialization/")
public class WebArticleCategoryRequest {

    @Text
    public final String name;

    public WebArticleCategoryRequest(String name) {
        this.name = name;
    }
}