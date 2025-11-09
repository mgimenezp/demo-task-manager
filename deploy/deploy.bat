
@echo off
echo ==== Simulando Deploy a Produccion ====
if not exist deploy\produccion mkdir deploy\produccion
copy ..\target\demo-task-manager-0.0.1-SNAPSHOT.jar deploy\produccion\
echo ==== Deploy completado ====
