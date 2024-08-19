package model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Result implements Serializable {
    private static final Map<String, DocumentData> DOCUMENT_TO_DOCUMENT_DATA = new HashMap<>();

    public void addDocumentData(String document, DocumentData documentData) {
        DOCUMENT_TO_DOCUMENT_DATA.put(document, documentData);
    }

    public Map<String, DocumentData> getDocumentToDocumentData() {
        return Collections.unmodifiableMap(DOCUMENT_TO_DOCUMENT_DATA);
    }
}
