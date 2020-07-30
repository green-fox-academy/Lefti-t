package com.backend.log.services;

import com.backend.log.models.Log;
import com.backend.log.services.payload.LogDTO;
import com.backend.log.services.payload.LogDtoEntryResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LogMapper {

    public Log mapLogDtoToLog(LogDTO logDto){
      Log log = new Log();
      log.setData(logDto.getData());
      log.setEndpoint(logDto.getEndpoint());
      return log;
    }

    public List<LogDtoEntryResponse> mapLogsToLogsDtos(List<Log> logs){
        List<LogDtoEntryResponse> listLogs = new ArrayList<>(logs.size());
        for(Log log : logs){
            LogDtoEntryResponse logDto = new LogDtoEntryResponse();
            logDto.setData(log.getData());
            logDto.setEndpoint(log.getEndpoint());
            logDto.setId(log.getId());
            listLogs.add(logDto);
        }
        return listLogs;
    }


}
