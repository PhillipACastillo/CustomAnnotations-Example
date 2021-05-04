package com.galvanize.annotations;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.galvanize.model.Person;
import org.junit.Test;


public class JsonSerializerUnitTest {
    @Test
    public void givenObjectSerializedThenReturned() throws JsonSerializationException {
        Person person = new Person("john", "doe", "18");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        assertEquals("{\"personAge\":\"18\",\"firstName\":\"John\"," +
                        "\"lastName\":\"Doe\"}",
                jsonString);
    }

    @Test
    public void throwJSONSerializationException() throws JsonSerializationException{
        // Person
        // Object to null
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        assertThrows(JsonSerializationException.class, () -> {
            serializer.convertToJson(null);
        });
    }
}

