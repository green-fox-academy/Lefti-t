package com.backend.log.services;

import com.backend.log.models.Log;
import com.backend.log.repositories.LogRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    final
    LogRepository logRepository;

    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public void saveLog(Log newLog) {
        this.logRepository.save(newLog);
    }

    @Override
    public List<Log> getLogs() {
        List<Log> allLogs = this.logRepository.findAll();
        return allLogs;
    }

}
