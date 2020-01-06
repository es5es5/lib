<h1>Louis's VSCode Settings.</h1>

<h2>Extention List</h2>

* Essential
    - Vetur
    - Auto Close Tag
    - ESlint
    - GitLens
    - Material Icon Theme
    - Material Syntax - Dark
    - eclipse keymap
    - Auto Rename Tag

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

And..
https://amati.io/2019/04/25/vs-code-extension-for-fe/?fbclid=IwAR3MKuHWIPGQRx2bgdhQSYv3iNkKIgy6LrXkLh-Wp8TnGC_fDOKErOhPIl4

<h3>User Settings for Windows<h3>

* setting.json
```json
{
    "workbench.iconTheme": "material-icon-theme",
    "workbench.colorTheme": "Material Syntax - Dark",
    "terminal.integrated.shell.windows": "C:\\Program Files\\Git\\bin\\bash.exe",
    "window.zoomLevel": 2,
    "editor.tabSize": 2,
    "editor.minimap.enabled": false,
    "files.trimFinalNewlines": true,
    "files.trimTrailingWhitespace": true,
    "explorer.compactFolders": false
}
```

* keybindings.json (Keyboard Shortcuts)
```json
// Place your key bindings in this file to override the defaults
[
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
    "key": "ctrl+shift+alt+n",
    "command": "explorer.newFolder"
  },
  {
    "key": "ctrl+alt+n",
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
    "key": "ctrl+n",
    "command": "explorer.newFile"
  }
]
```

<hr>

<h3>User Settings for Mac OS<h3>

```json
{
    "editor.minimap.enabled": false,
    "workbench.colorTheme": "Material Syntax - Dark",
    "window.zoomLevel": 0,
    "workbench.iconTheme": "material-icon-theme",
    "editor.detectIndentation": false,
    "editor.tabSize": 2
}
```
