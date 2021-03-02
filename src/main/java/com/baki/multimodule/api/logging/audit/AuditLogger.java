package com.baki.multimodule.api.logging.audit;

public interface AuditLogger {
    void auditLog(AuditEvent auditEvent);
    void auditLog(String message);
}
