package com.ralien.erp_system.timesheet.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

import static com.ralien.erp_system.timesheet.util.Constants.UNIX_DT_FORMAT;

public class UnixDateTimeSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(UNIX_DT_FORMAT.format(date));
    }
}
