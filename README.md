# kotlin-parser-v1.2
Пример работы без IDE на основе VisualStudio Code в связке с WSL, Gradle

## Установка и настройка VisualStudio code
### Дистрибутив системы: 
[Офф. сайт VisualStudio code](https://code.visualstudio.com/)

### Список используемых плагинов:
* [Better Comments](https://marketplace.visualstudio.com/items?itemName=aaron-bond.better-comments) - цветастые комментарии
* [Code Runner](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner) - мини компилятор, удобно на старте (чтоб не дергать лишний раз gradle) 
* [Kotlin Language](https://marketplace.visualstudio.com/items?itemName=mathiasfrohlich.Kotlin) - Поддержка языка Kotlin (на практике только подсветка синтаксиса 🤷‍♂️) 
* [Gradle Language Support](https://marketplace.visualstudio.com/items?itemName=naco-siren.gradle-language) - Поддержка скриптов Gradle
* [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java) - Поддержка Java - может пригодится если захочится использовать Java в проекте

### Подключаем VCS
Так как в VSCode встроен гит, подключить систему контроля версий к проект просто - [Статья по подключению к GIT](https://code.visualstudio.com/docs/editor/versioncontrol)

## Установка и настройка WSL
Для запуска Gradle необходимы повышенные права, запускать отдельную консоль для запуска скриптов не хотелось, а встроенный в VSCode терминал (CMD и PShell) почему то не запускается с правами админа, поэтому ставим **bash**. 

> В кратце: в win10 WSL.exe не установлен по умолчанию, установку необходимо производить из MicrosoftStore (я выбрал WSL на базе Ubuntu).

Для запуска Gradle и сборки проекта нужна Java JDK. Так как запускать будем из под **WSL** а он является *подсистемой*, [устанавливать JDK нужно из под WSL](https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-get-on-ubuntu-16-04). Запуск WSL под VSCode можно открыв **command panel**, написав: `shell -> Select Default Shell -> WSL Bash` 

> после этого терминал будет доступен по hotkey: **CTRL+`**

## Установка Gralde
[Статья по установке](https://gradle.org/install/)

[Статья по сборке Kotlin](https://guides.gradle.org/building-kotlin-jvm-libraries/)

Основы теории по запуску kotlin CLI - не нашел оригинальную статью - [вот ссылка на перевод](http://qaru.site/questions/160117/how-to-run-kotlin-class-from-the-command-line)

# Итоги
Всё готово к работе в VSCode - правда мне как оказалось очень необходима помощь интерпритатора с подсказками - я не готов ещё писать в чистом блокноте 😊 - в итоге переехал на [IntelliJ IDEA 2018.3.2](https://www.jetbrains.com/idea/)
