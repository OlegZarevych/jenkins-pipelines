def installGo() {
    echo "Installing Go..." 
    sh """
      sudo apt install golang-go
    """
    echo "Go installed successfully!"
}