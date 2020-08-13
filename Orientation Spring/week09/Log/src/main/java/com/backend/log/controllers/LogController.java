package com.backend.log.controllers;

import com.backend.log.models.Log;
import com.backend.log.services.LogMapper;
import com.backend.log.services.LogService;
import com.backend.log.services.payload.LogDTO;
import com.backend.log.services.payload.LogDtoEntryResponse;
import com.backend.log.services.payload.LogDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LogController {

    final
    LogService logService;

    final LogMapper logMapper;

    public LogController(LogService logService, LogMapper logMapper) {
        this.logService = logService;
        this.logMapper = logMapper;
    }

//    @PutMapping("/log/{}")
//    public LogDtoEntryResponse saveLog(@RequestParam LogDTO logDto) {
//    Log log = logMapper.mapLogDtoToLog(logDto);
//    this.logService.saveLog(log);
//    return new LogDtoEntryResponse(log.getId(),log.getEndpoint(),log.getData());
//    }

    @GetMapping("/appenda/{appendable}")
    String appendA(@PathVariable String appendable) {
        Log log = new Log("/aapenda/"+appendable, appendable);
        this.logService.saveLog(log);
        return new String(appendable);
    }



    @GetMapping("/log")
    public LogDtoResponse getLogs() {
        List<Log> logs = this.logService.getLogs();
        List<LogDtoEntryResponse> logEntries = logMapper.mapLogsToLogsDtos(logs);
        return new LogDtoResponse(logEntries,logs.size());
    }

}
