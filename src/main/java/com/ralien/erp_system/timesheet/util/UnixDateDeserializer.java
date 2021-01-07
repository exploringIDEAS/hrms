package com.ralien.erp_system.timesheet.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import static com.ralien.erp_system.timesheet.util.Constants.UNIX_DATE_FORMAT;
import static com.ralien.erp_system.timesheet.util.Constants.UNIX_DT_FORMAT;

public class UnixDateDeserializer extends JsonDeserializer<Date> {
    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        try {
            return UNIX_DATE_FORMAT.parse(jsonParser.getText());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
