FROM mcr.microsoft.com/windows/servercore

COPY otelcol_windows_amd64.exe /otelcol_windows_amd64.exe
COPY src/collector/collector-config.yml /collector-config.yml

CMD otelcol_windows_amd64.exe --config collector-config.yml