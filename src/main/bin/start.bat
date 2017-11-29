@echo off

SET base=%~dp0
SET main_class="com.masget.App"

SET conf=%base%..\conf
SET libs=%base%..\lib
SET class_path=%conf%;%libs%\*;
java -classpath %class_path% %main_class%

@pause
