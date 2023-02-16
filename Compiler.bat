@echo off
set "srcdir=%cd%"

for /d /r "%srcdir%" %%d in (*\src) do (
    echo Compiling files in "%%d"
    call javac -sourcepath "%%d" -d "%%d" "%%d\*.java"
)

echo Done compiling all .java files in /src directories.
pause
