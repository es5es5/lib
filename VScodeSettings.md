<h1>Louis's VSCode Settings.</h1>

<h2>Extention List</h2>

* Essential
    - Vetur
    - Auto Close Tag
    - ESlint
    - GitLens
    - Material Icon Theme
    - Material Syntax - Dark (but, I used 'dark-plus-syntax')
    - eclipse keymap
    - Auto Rename Tag
    - React snippets (for React.js)
    - dark-plus-syntax

* Optional
    - Beautify
    - Color Picker
    - Night Owl
    - Project Manager
    - TSLint
    - open in browser
    - Instant Markdown
    - TODO Highlight
    - javascript console util
    - Vue VSCode Snippets
    - Live Server
    - change-case
    - SVG Previewer

And..
https://amati.io/2019/04/25/vs-code-extension-for-fe/?fbclid=IwAR3MKuHWIPGQRx2bgdhQSYv3iNkKIgy6LrXkLh-Wp8TnGC_fDOKErOhPIl4

<h3>User Settings for Windows<h3>

* setting.json
```json
{
  "workbench.iconTheme": "material-icon-theme",
  "terminal.integrated.shell.windows": "C:\\Program Files\\Git\\bin\\bash.exe",
  "editor.tabSize": 2,
  "files.trimFinalNewlines": true,
  "files.trimTrailingWhitespace": true,
  "explorer.compactFolders": false,
  "java.jdt.ls.vmargs": "-XX:+UseParallelGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -Dsun.zip.disableMemoryMapping=true -Xmx1G -Xms100m -javaagent:\"c:\\Users\\hwlee\\.vscode\\extensions\\gabrielbb.vscode-lombok-1.0.1\\server\\lombok.jar\"",
  "diffEditor.ignoreTrimWhitespace": false,
  "editor.minimap.maxColumn": 50,
  "svg.preview.mode": "svg",
  "editor.suggestSelection": "recentlyUsedByPrefix",
  "editor.wordBasedSuggestions": "off",
  "editor.formatOnSave": true,
  "editor.codeActionsOnSave": {
    "source.fixAll.eslint": "explicit"
  },
  "[xml]": {
    "editor.defaultFormatter": "fabianlauer.vs-code-xml-format"
  },
  "editor.minimap.enabled": false,
  "[json]": {
    "editor.defaultFormatter": "vscode.json-language-features"
  },
  "[dart]": {
    "editor.formatOnSave": true,
    "editor.formatOnType": true,
    "editor.codeActionsOnSave": {
      "dart.allowAnalytics": "never",
      "dart.previewLsp": "explicit",
      "editor.formatOnSave": "explicit",
      "quickfix.insertSemicolon": "explicit"
    },
    "editor.rulers": [500],
    "editor.selectionHighlight": false,
    "editor.suggest.snippetsPreventQuickSuggestions": false,
    "editor.suggestSelection": "first",
    "editor.tabCompletion": "onlySnippets",
    "editor.wordBasedSuggestions": "off"
  },
  "dart.showInspectorNotificationsForWidgetErrors": false,
  "spring-boot.ls.java.home": "C:\\Program Files (x86)\\ojdkbuild\\jdk-11",
  "[python]": {
    "editor.formatOnType": true
  },
  "workbench.colorTheme": "Default Dark+",
  "window.title": "${folderName}",
  "terminal.integrated.defaultProfile.windows": "Git Bash",
  "emmet.includeLanguages": {
    "javascript": "javascriptreact",
    "vue-html": "html",
    "vue": "html"
  },
  "editor.accessibilitySupport": "off",
  "window.zoomLevel": 1,
  "[css]": {
    "editor.formatOnSave": false,
    "editor.defaultFormatter": "sibiraj-s.vscode-scss-formatter"
  },
  "eslint.codeActionsOnSave.rules": null,
  "eslint.format.enable": true,
  "[vue]": {
    "editor.defaultFormatter": "esbenp.prettier-vscode"
  },
  "[javascript]": {
    "editor.defaultFormatter": "esbenp.prettier-vscode"
  },
  "[typescript]": {
    "editor.defaultFormatter": "esbenp.prettier-vscode"
  },
  "[javascriptreact]": {
    "editor.defaultFormatter": "esbenp.prettier-vscode"
  },
  "[typescriptreact]": {
    "editor.defaultFormatter": "esbenp.prettier-vscode"
  },
  "workbench.editor.enablePreview": false,
  "git.ignoreRebaseWarning": true
}

```

* keybindings.json (Keyboard Shortcuts)
```json
// Place your key bindings in this file to override the defaults
[
  {
    "key": "ctrl+i",
    "command": "editor.action.insertSnippet",
    "when": "editorTextFocus",
    "args": {
        "snippet": "console.info($1)$0"
    }
  },
  {
    "key": "ctrl+l",
    "command": "editor.action.insertSnippet",
    "when": "editorTextFocus",
    "args": {
        "snippet": "console.log($1)$0"
    }
  },
  {
    "key": "ctrl+shift+right",
    "command": "cursorWordEndRightSelect",
    "when": "textInputFocus"
  },
  {
    "key": "ctrl+shift+left",
    "command": "cursorWordStartLeftSelect",
    "when": "textInputFocus"
  },
  {
    "key": "ctrl+shift+numpad_add",
    "command": "editor.action.transformToUppercase",
    "when": "editorTextFocus"
  },
  {
    "key": "ctrl+shift+numpad_subtract",
    "command": "editor.action.transformToLowercase",
    "when": "editorTextFocus"
  },
  {
    "key": "ctrl+shift+n",
    "command": "explorer.newFolder"
  },
  {
    "key": "ctrl+n",
    "command": "explorer.newFile"
  },
  {
    "key": "ctrl+shift+d",
    "command": "editor.action.addSelectionToNextFindMatch",
    "when": "editorFocus"
  },
  {
    "key": "ctrl+d",
    "command": "-editor.action.addSelectionToNextFindMatch",
    "when": "editorFocus"
  },
  {
    "key": "ctrl+shift+8",
    "command": "editor.action.indentUsingTabs"
  },
  {
    "key": "ctrl+shift+9",
    "command": "editor.action.indentationToTabs"
  },
  {
    "key": "alt+f1",
    "command": "workbench.files.action.showActiveFileInExplorer"
  }
]
```

<hr>

<h3>User Settings for Mac OS<h3>

* setting.json
```json
{
    "editor.minimap.enabled": false,
    "workbench.colorTheme": "Material Syntax - Dark",
    "window.zoomLevel": 0,
    "workbench.iconTheme": "material-icon-theme",
    "editor.detectIndentation": false,
    "editor.tabSize": 2,
    "emmet.includeLanguages": {
        "javascript": "javascriptreact"
    }
}

```

* keybindings.json (Keyboard Shortcuts)
```json
// Place your key bindings in this file to override the defaultsauto[]
[
  {
    "key": "cmd+l",
    "command": "editor.action.insertSnippet",
    "when": "editorTextFocus",
    "args": {
        "snippet": "console.log($1)$0"
    }
  },
  {
    "key": "shift+cmd+d",
    "command": "editor.action.addSelectionToNextFindMatch",
    "when": "editorFocus"
  },
  {
    "key": "cmd+d",
    "command": "-editor.action.addSelectionToNextFindMatch",
    "when": "editorFocus"
  },
  {
    "key": "shift+cmd+=",
    "command": "editor.action.transformToUppercase",
    "when": "editorTextFocus"
  },
  {
    "key": "shift+cmd+x",
    "command": "-editor.action.transformToUppercase",
    "when": "editorTextFocus"
  },
  {
    "key": "shift+cmd+-",
    "command": "editor.action.transformToLowercase",
    "when": "editorTextFocus"
  },
  {
    "key": "shift+cmd+y",
    "command": "-editor.action.transformToLowercase",
    "when": "editorTextFocus"
  },
  {
    "key": "shift+cmd+9",
    "command": "editor.action.indentUsingTabs"
  },
  {
    "key": "shift+cmd+0",
    "command": "editor.action.indentationToTabs"
  },
  {
    "key": "cmd+n",
    "command": "explorer.newFile"
  },
  {
    "key": "shift+cmd+n",
    "command": "explorer.newFolder"
  },
  {
    "key": "cmd+1",
    "command": "workbench.files.action.showActiveFileInExplorer"
  },
  {
    "key": "shift+alt+right",
    "command": "-cursorWordPartRightSelect",
    "when": "textInputFocus"
  },
  {
    "key": "shift+alt+left",
    "command": "-cursorWordPartLeftSelect",
    "when": "textInputFocus"
  }
]
```
