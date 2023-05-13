import React from "react";
class TodoPage extends React.Component {
    constructor(props) {
        super(props);
        this.state = { items: [], Text: '' };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleDelete = this.handleDelete.bind(this);
    }
    render() {
        return (
            <div>
                <h3>TODO DE LA  IUE</h3>
                <TodoList items={this.state.items} onDelete={this.handleDelete} />
                <form onSubmit={this.handleSubmit}>
                    <label htmlFor="new-todo"> Agregar Nueva Tarea? </label>
                    <input
                        id="new-todo"
                        onChange={this.handleChange}
                        value={this.state.Text}
                    />
                    <button>
                        Agregar #{this.state.items.length + 1}
                    </button>
                </form>
            </div>
        );
    }
    handleChange(e) {
        this.setState({ Text: e.target.value});
    }


    handleSubmit(e) {
        e.preventDefault();
        if (this.state.Text.length === 0) {
            return;
        }
        const newItem = {
            Text: this.state.Text,
            id: Date.now()
        };
        this.setState(state =>({
            items: state.items.concat(newItem),
            Text: ''
        }));
    }
    handleDelete(id) {
        const updateItems = this.state.items.filter(item => item.id !== id);
        this.setState({items: updateItems});
    }
}
class TodoList extends React.Component {
    render() {
        return (
            <ul>
                {this.props.items.map(item => (
                    <li key={item.id}>
                        {item.Text}
                        <button onClick={() => this.props.onDelete(item.id)}>Delete</button>
                    </li>
                ))}
            </ul>
        );
    }
}
export default TodoPage;