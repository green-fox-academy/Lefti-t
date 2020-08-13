package com.backend.log.services;

import com.backend.log.models.Log;

import java.util.List;

public interface LogService {
    void saveLog(Log log);

    List<Log> getLogs();
}
